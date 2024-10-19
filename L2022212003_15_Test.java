import static org.junit.Assert.*;
import org.junit.Test;


/*
* 测试类设计原则：
* - 覆盖所有功能：程序在比较修订号时，应有忽略任何前导零后的整数值、将未指定的版本号视为0的功能
* - 等价类划分：根据version1大于、等于、小于version2三种情况划分等价类
*/
public class L2022212003_15_Test {

    private Solution solution = new Solution();//被测试的类实例

    // 测试目的：测试忽略前导0功能是否正常
    // 测试用例："1.01" 和 "1.001"，忽略前导0，应相等
    @Test
    public void testCompareVersion1() {
        assertEquals(0, solution.compareVersion("1.01", "1.001"));
    }

    // 测试目的：测试无修订号下的比较是否正常
    // 测试用例："1.0" 和 "1.0.0"，无修订号视为0，应当相等
    @Test
    public void testCompareVersion2() {
        assertEquals(0, solution.compareVersion("1.0", "1.0.0"));
    }

    // 测试目的：测试程序是否在version1<version2的情况下，可以正常运行并给出预期结果
    // 测试用例："0.1" 和 "1.1"，version1小于version2，应当返回 -1
    @Test
    public void testCompareVersion3() {
        assertEquals(-1, solution.compareVersion("0.1", "1.1"));
    }

    // 测试目的：测试程序是否在version1>version2的情况下，可以正常运行并给出预期结果
    // 测试用例："1.0.1" 和 "1.0"，version1大于version2，应当返回 1
    @Test
    public void testCompareVersion4() {
        assertEquals(1, solution.compareVersion("1.0.1", "1.0"));
    }
}