package structure.com.zy.Composite;

/**
 * HR部门
 * @author eaves.zhu
 *
 */
public class HRDepartment extends Company {  
    
    
    public HRDepartment(){  
          
    }  
      
    public HRDepartment(String name){  
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