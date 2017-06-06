package com.zff.web.start;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

/**
 * @ClassName:  InterfaceUrlIntiServlet   
 * @Description:TODO(项目文件初始化)
 * @author: Android_Robot  
 * @date:   2017年5月31日 下午8:11:47   
 *
 */
public class InterfaceUrlIntiServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
    public void init(ServletConfig config) throws ServletException {
        InterfaceUrlInti.init();
    }
}
