import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

@Test
public class Hello {
    public void test1(){
        Assert.assertEquals(1,2);
    }

    public void test2(){
        Assert.assertEquals(1,1);
    }

    public void logDemo() {
        Reporter.log("这是我们自己写的日志");
        throw new RuntimeException("这是我自己的运行时异常");
    }
}
