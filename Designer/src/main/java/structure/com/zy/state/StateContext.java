package structure.com.zy.state;

/**
 * created by Freeze on 2019/1/13
 **/
public class StateContext {
    private IState istate = null;

    /**
     * 设置状态对象
     *
     * @param i
     */
    public void setIstate(int i) {
        if (i == 1) {
            istate = new FirstStateImpl();
            System.out.println("正在加热...");
        } else if (i == 2) {
            istate = new SecondStateImpl();
            System.out.println("正在加热...");
        } else if (i == 3) {
            istate = new ThirdStateImpl();
            System.out.println("加热完成！");
        }
    }


    public IState getIstate() {
        return istate;
    }
}
