package com.zff.wechat.message.resp;

import java.util.List;

/**
 * 
 * @ClassName:  NewsMessage   
 * @Description:��ͼ����Ϣ
 * @author: Android_Robot  
 * @date:   2017��6��2�� ����4:20:48   
 *
 */
public class NewsMessage extends BaseMessage {  
    // ͼ����Ϣ����������Ϊ 10 ������   
    private int ArticleCount;  
    // ����ͼ����Ϣ��Ϣ��Ĭ�ϵ�һ�� item Ϊ��ͼ   
    private List<Article> Articles;  

    public int getArticleCount() {  
        return ArticleCount;  
    }  

    public void setArticleCount(int articleCount) {  
        ArticleCount = articleCount;  
    }  

    public List<Article> getArticles() {  
        return Articles;  
    }  

    public void setArticles(List<Article> articles) {  
        Articles = articles;  
    }  
}