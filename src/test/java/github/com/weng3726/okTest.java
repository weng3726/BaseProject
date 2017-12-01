package github.com.weng3726;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class okTest {
    @Test
    public void getType() throws Exception {
        ok ok = new ok ( 5, 10 ,  5);

        String result = ok.getType();

        Assert.assertEquals("不是三角形",result);
    }

}
