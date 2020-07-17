package yyx.javaplayer.springbootdemozuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.commons.lang.StringUtils;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
public class demoFilter extends ZuulFilter {
    @Override
    public String filterType() {
        //设置过滤类型
        return FilterConstants.PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        //设置过滤器优先级
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        //是否需要过滤
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        //如果前端发起请求没有带指定请求头将不进允许请求，如果需要读取cookie等敏感信息，要在配置文件中加入sensitive-headers:,下面有对该配置的详解
        RequestContext context=RequestContext.getCurrentContext();
        HttpServletRequest request=context.getRequest();
        String token=request.getHeader("token");
        if (!StringUtils.isEmpty(token)){
            //项目启动后如果访问不带Token请求头，将被拦截，返回Unauthorized
            context.setResponseStatusCode(HttpStatus.UNAUTHORIZED.value());
            context.setResponseBody(org.springframework.http.HttpStatus.UNAUTHORIZED.getReasonPhrase());
            context.setSendZuulResponse(false);
        }
        return true;
    }
}
