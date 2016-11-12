package com.zy.Composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * 公司是一个多个公司组成的集合
 * @author eaves.zhu
 *
 */
public class ConcreteCompany extends Company {  
    private List<Company> cList;  
  
    public ConcreteCompany() {  
        cList = new ArrayList<Company>();  
    }  
  
    public ConcreteCompany(String name) {  
        super(name);   
        cList = new ArrayList<Company>() ;   
    }  
  
    @Override  
    protected void add(Company company) {  
        cList.add(company);  
    }  
  
    @Override  
    protected void display(int depth) {  
        // TODO Auto-generated method stub  
        StringBuilder sb = new StringBuilder("");  
        for (int i = 0; i < depth; i++) {  
            sb.append("-");   
        }  
        System.out.println(new String(sb) + this.getName());  
        for (Company c : cList) {  
            c.display(depth + 2);  
        }  
    }  
  
    @Override  
    protected void romove(Company company) {  
        cList.remove(company);  
    }  
}  