package com.zff.web.start;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

/**
 * @ClassName:  InterfaceUrlIntiServlet   
 * @Description:TODO(��Ŀ�ļ���ʼ��)
 * @author: Android_Robot  
 * @date:   2017��5��31�� ����8:11:47   
 *
 */
public class InterfaceUrlIntiServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
    public void init(ServletConfig config) throws ServletException {
        InterfaceUrlInti.init();
    }
}
