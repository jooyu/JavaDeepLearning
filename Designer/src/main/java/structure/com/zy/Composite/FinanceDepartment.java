package structure.com.zy.Composite;

/**
 * 
 * 财政部门，属于公司类的一种组织
 * @author eaves.zhu
 *
 */
public class FinanceDepartment extends Company {  
    
    
    public FinanceDepartment(){  
          
    }  
      
    public FinanceDepartment(String name){  
        super(name);  
    }  
      
    @Override  
    protected void add(Company company) {  
  
    }  
  
    @Override  
    protected void display(int depth) {  
        StringBuilder sb = new StringBuilder("");  
        for (int i = 0; i < depth; i++) {  
            sb.append("-");  
        }  
        System.out.println(new String(sb) + this.getName() ) ;   
    }  
  
    @Override  
    protected void romove(Company company) {  
          
    }  
      
}  