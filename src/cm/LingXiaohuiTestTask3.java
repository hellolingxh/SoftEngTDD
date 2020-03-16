package cm;

import java.math.BigDecimal;
import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class LingXiaohuiTestTask3 {

    /**
     * Construction Test Case number: #1 - Condition1
     *
     * Given: reducedPeriods is a list is not null
     * When:  reducePeriods is null
     * Then:  throw an IllegalArgumentException
     */
    @Test(expected = IllegalArgumentException.class)
    public void constructionTestCase1() {
        Period period = new Period(1, 2);
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(period);
        Rate rate = new StaffRate(new BigDecimal(3.0), new BigDecimal(2.0), null, normalPeriods);
        Assert.assertNotNull(rate);
    }

    /**
     * Construction Test Case number: #2 - Condition2
     *
     * Given: normalPeriods is a list is not null
     * When:  normalPeriods is null
     * Then:  throw an IllegalArgumentException
     */
    @Test(expected = IllegalArgumentException.class)
    public void constructionTestCase2() {
        Period period = new Period(1, 2);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(period);
        Rate rate = new StaffRate(new BigDecimal(3.0), new BigDecimal(2.0), reducedPeriods, null);
        Assert.assertNotNull(rate);
    }

    /**
     * Construction Test Case number:　#３ - Condition3
     *
     * Given: normalRate and ReducedRate are great  than or equal to 0
     * When:  the normalRate is less than 0
     * Then: throw an IllegalArgumentException
     */
    @Test(expected = IllegalArgumentException.class)
    public void constructionTestCase3() {
        Period reducePeriod = new Period(8, 10);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(reducePeriod);

        Period normalPeriod = new Period(3, 5);
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(normalPeriod);

        Rate rate = new StaffRate(new BigDecimal(-1.0), new BigDecimal(2.0), reducedPeriods, normalPeriods);
        Assert.assertNotNull(rate);
    }

    /**
     * Construction Test Case number:　#4 - Condition3
     *
     * Given: normalRate and ReducedRate are great  than or equal to 0
     * When:  the reduceRate is less than 0
     * Then:  throw an IllegalArgumentException
     */
    @Test(expected = IllegalArgumentException.class)
    public void constructionTestCase4() {
        Period reducePeriod = new Period(8, 10);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(reducePeriod);

        Period normalPeriod = new Period(3, 5);
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(normalPeriod);

        Rate rate = new StaffRate(new BigDecimal(1.0), new BigDecimal(-2.0), reducedPeriods, normalPeriods);
        Assert.assertNotNull(rate);
    }

    /**
     * Construction Test Case number:　#5 - Condition3
     *
     * Given: normalRate and ReducedRate are great  than or equal to 0
     * When:  the normalRate and the reducedRate both are equal to 0
     * Then:  return an instance of Rate
     */
    @Test
    public void constructionTestCase5() {
        Period reducePeriod = new Period(8, 10);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(reducePeriod);

        Period normalPeriod = new Period(3, 5);
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(normalPeriod);

        Rate rate = new StaffRate(new BigDecimal(0), new BigDecimal(0), reducedPeriods, normalPeriods);
        Assert.assertNotNull(rate);
    }

    /**
     * Construction Test Case number:　#6 - Condition3
     *
     * Given: normalRate and ReducedRate are great  than or equal to 0
     * When:  the normalRate and the reducedRate both are great than 0
     * Then:  return an instance of Rate
     */
    @Test
    public void constructionTestCase6() {
        Period reducePeriod = new Period(13, 15);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(reducePeriod);

        Period normalPeriod = new Period(8, 12);
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(normalPeriod);

        Rate rate = new StaffRate(new BigDecimal(3.0), new BigDecimal(2.0), reducedPeriods, normalPeriods);
        Assert.assertNotNull(rate);
    }

    /**
     * Construction Test Case number:　#7 - Condition4
     *
     * Given: normalRate has to be great or equal to reduceRate
     * When:  normalRate less than reduceRate
     * Then:  throw an IllegalArgumentException
     */
    @Test(expected = IllegalArgumentException.class)
    public void constructionTestCase7() {
        Period reducePeriod = new Period(8, 10);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(reducePeriod);

        Period normalPeriod = new Period(3, 5);
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(normalPeriod);

        Rate rate = new StaffRate(new BigDecimal(2.0), new BigDecimal(3.0), reducedPeriods, normalPeriods);
        Assert.assertNotNull(rate);
    }

    /**
     * Construction Test Case number:　#8 - Condition4
     *
     * Given: normalRate has to be great or equal to reduceRate
     * When:  normalRate is great than reduceRate
     * Then:  return an instance of Rate
     */
    @Test
    public void constructionTestCase8() {
        Period reducePeriod = new Period(8, 12);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(reducePeriod);

        Period normalPeriod = new Period(3, 6);
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(normalPeriod);

        Rate rate = new StaffRate(new BigDecimal(3.0), new BigDecimal(2.0), reducedPeriods, normalPeriods);
        Assert.assertNotNull(rate);
    }

    /**
     * Construction Test Case number:　#9 - Condition4
     *
     * Given: normalRate has to be great or equal to reduceRate
     * When:  normalRate is equal to reduceRate
     * Then:  return an instance of Rate
     */
    @Test
    public void constructionTestCase9() {
        Period reducePeriod = new Period(8, 12);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(reducePeriod);

        Period normalPeriod = new Period(3, 5);
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(normalPeriod);

        Rate rate = new StaffRate(new BigDecimal(2.0), new BigDecimal(2.0), reducedPeriods, normalPeriods);
        Assert.assertNotNull(rate);
    }

    /**
     * Construction Test Case number:　#10 - Condition5
     *
     * Given: a collection of the normalPeriods must not overlap
     * When:  normalPeriods is overlap
     * Then:  throw an IllegalArgumentException
     */
    @Test(expected = IllegalArgumentException.class)
    public void constructionTestCase10() {
        Period reducePeriod1 = new Period(3, 5);
        Period reducePeriod2 = new Period(8, 14);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(reducePeriod1);
        reducedPeriods.add(reducePeriod2);

        Period normalPeriod1 = new Period(10, 12);
        Period normalPeriod2 = new Period(7, 11);
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(normalPeriod1);
        normalPeriods.add(normalPeriod2);

        Rate rate = new StaffRate(new BigDecimal(5.0), new BigDecimal(2.0), reducedPeriods, normalPeriods);
        Assert.assertNotNull(rate);
    }

    /**
     * Construction Test Case number:　#11 - Condition5
     *
     * Given: a collection of the normalPeriods must not overlap
     * When:  normalPeriods is not overlap
     * Then:  return an instance of Rate
     */
    @Test
    public void constructionTestCase11() {
        Period reducePeriod = new Period(1, 2);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(reducePeriod);

        Period normalPeriod1 = new Period(10, 12);
        Period normalPeriod2 = new Period(7, 10);
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(normalPeriod1);
        normalPeriods.add(normalPeriod2);

        Rate rate = new StaffRate(new BigDecimal(5.0), new BigDecimal(2.0), reducedPeriods, normalPeriods);
        Assert.assertNotNull(rate);
    }

    /**
     * Construction Test Case number:　#12 - Condition6
     *
     * Given: a collection of the reducedPeriods must not overlap
     * When:  reducedPeriods is overlap
     * Then:  throw an IllegalArgumentException
     */
    @Test(expected = IllegalArgumentException.class)
    public void constructionTestCase12() {
        Period reducePeriod1 = new Period(7, 10);
        Period reducePeriod2 = new Period(8, 12);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(reducePeriod1);
        reducedPeriods.add(reducePeriod2);

        Period normalPeriod1 = new Period(3, 5);
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(normalPeriod1);

        Rate rate = new StaffRate(new BigDecimal(5.0), new BigDecimal(2.0), reducedPeriods, normalPeriods);
        Assert.assertNotNull(rate);
    }

    /**
     * Construction Test Case number:　#13 - Condition6
     *
     * Given: a collection of the reducedPeriods must not overlap
     * When:  reducedPeriods is not overlap
     * Then:  return an instance of Rate
     */
    @Test(expected = IllegalArgumentException.class)
    public void constructionTestCase13() {
        Period reducedPeriod1 = new Period(10, 12);
        Period reducedPeriod2 = new Period(7, 10);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(reducedPeriod1);
        reducedPeriods.add(reducedPeriod2);

        Period normalPeriod1 = new Period(3, 5);
        Period normalPeriod2 = new Period(8, 14);
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(normalPeriod1);
        normalPeriods.add(normalPeriod2);

        Rate rate = new StaffRate(new BigDecimal(5.0), new BigDecimal(2.0), reducedPeriods, normalPeriods);
        Assert.assertNotNull(rate);
    }

    /**
     * Construction Test Case number:　#14 - Condition7
     *
     * Given: the normalRate and reducedRate are not null
     * When:  normalRate is null
     * Then:  throw an IllegalArgumentException
     */
    @Test(expected = IllegalArgumentException.class)
    public void constructionTestCase14() {
        Period reducedPeriod1 = new Period(10, 12);
        Period reducedPeriod2 = new Period(7, 10);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(reducedPeriod1);
        reducedPeriods.add(reducedPeriod2);

        Period normalPeriod1 = new Period(13, 18);
        Period normalPeriod2 = new Period(19, 20);
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(normalPeriod1);
        normalPeriods.add(normalPeriod2);

        Rate rate = new StaffRate(null, new BigDecimal(2.0), reducedPeriods, normalPeriods);
        Assert.assertNotNull(rate);
    }


    /**
     * Construction Test Case number:　#15 - Condition7
     *
     * Given: the normalRate and reducedRate are not null
     * When:  reducedRate is null
     * Then:  throw an IllegalArgumentException
     */
    @Test(expected = IllegalArgumentException.class)
    public void constructionTestCase15() {
        Period reducedPeriod1 = new Period(10, 12);
        Period reducedPeriod2 = new Period(7, 10);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(reducedPeriod1);
        reducedPeriods.add(reducedPeriod2);

        Period normalPeriod1 = new Period(3, 5);
        Period normalPeriod2 = new Period(6, 7);
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(normalPeriod1);
        normalPeriods.add(normalPeriod2);

        Rate rate = new StaffRate(new BigDecimal(5.0), null, reducedPeriods, normalPeriods);
        Assert.assertNotNull(rate);
    }

    /**
     * Construction Test Case number:　#16
     *
     * Given: the normalPeriods and reducedPeriods each other cannot overlap
     * When: the normalPeriods and reducePeriods each other overlaps
     * Then: throws an IllegalArgumentException
     */
    @Test(expected = IllegalArgumentException.class)
    public void constructionTestCase16() {
        Period reducedPeriod1 = new Period(10, 12);
        Period reducedPeriod2 = new Period(13, 19);
        Period reducedPeriod3 = new Period(7, 9);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(reducedPeriod1);
        reducedPeriods.add(reducedPeriod2);
        reducedPeriods.add(reducedPeriod3);

        Period normalPeriod1 = new Period(16, 17);
        Period normalPeriod2 = new Period(18, 19);
        Period normalPeriod3 = new Period(20, 22);
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(normalPeriod1);
        normalPeriods.add(normalPeriod2);
        normalPeriods.add(normalPeriod3);

        Rate rate = new StaffRate(new BigDecimal(5.0), new BigDecimal(2.0), reducedPeriods, normalPeriods);
        Assert.assertNotNull(rate);
    }

    /**
     * Construction Test Case number:　#17 - Condition 9 (Boundary test)
     *
     * Given: the element of normalPeriods or reducedPeriods the first element and the last element.
     * When:  the reducedPeriods the first element and the last element is overlap.
     * Then:  throws an IllegalArgumentException
     */
    @Test(expected = IllegalArgumentException.class)
    public void constructionTestCase17() {
        Period reducedPeriod1 = new Period(13, 14);
        Period reducedPeriod2 = new Period(10, 12);
        Period reducedPeriod3 = new Period(13, 15);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(reducedPeriod1);
        reducedPeriods.add(reducedPeriod2);
        reducedPeriods.add(reducedPeriod3);

        Period normalPeriod1 = new Period(17, 18);
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(normalPeriod1);

        Rate rate = new StaffRate(new BigDecimal(5.0), new BigDecimal(2.0), reducedPeriods, normalPeriods);
        Assert.assertNotNull(rate);
    }

    /**
     * Calculate method Test Case Number: #1 - Condition1
     *
     * Given: The periodStay must be not null
     * When: the instance of Rate is created by
     * 			- kind: STAFF
     * 			- normalRate: 5
     * 			- reducedRate: 2
     * 			- reducedPeriods: [(10, 13), (15, 16)]
     * 			- normalPeriods: [(9,10), (14, 15), (16, 23)]
     * 		  and the instance of periodStay is null
     * Then: Throw an IllegalArgumentException
     */
    @Test(expected = IllegalArgumentException.class)
    public void calculateTestCase1() {
        Period reducedPeriod1 = new Period(10, 13);
        Period reducedPeriod2 = new Period(15, 16);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(reducedPeriod1);
        reducedPeriods.add(reducedPeriod2);

        Period normalPeriod1 = new Period(9, 10);
        Period normalPeriod2 = new Period(14, 15);
        Period normalPeriod3 = new Period(16, 23);
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(normalPeriod1);
        normalPeriods.add(normalPeriod2);
        normalPeriods.add(normalPeriod3);

        Rate rate = new StaffRate(new BigDecimal(5.0), new BigDecimal(2.0), reducedPeriods, normalPeriods);
        Assert.assertNotNull(rate);
        rate.calculate(null);
    }

    /**
     * Calculate method Test Case Number: #2 - Condition2
     *
     * Given: The startHour of periodStay must greater than or equal to 0 and it less than or equals to 24,
     * 		  and  endHour of the periodStay must greater or equal to 0 and it less than or equals to 24
     * When: the instance of Rate is created by
     * 			- kind: STAFF
     * 			- normalRate: 5
     * 			- reducedRate: 2
     * 			- reducedPeriods: [(10, 13), (15, 16)]
     * 			- normalPeriods: [(9,10), (14, 15), (16, 23)]
     * 		  and the instance of periodStay is -1 for startHour and 3 for endHour
     * Then: Throw an IllegalArgumentException
     */
    @Test(expected = IllegalArgumentException.class)
    public void calculateTestCase2() {
        Period reducedPeriod1 = new Period(10, 13);
        Period reducedPeriod2 = new Period(15, 16);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(reducedPeriod1);
        reducedPeriods.add(reducedPeriod2);

        Period normalPeriod1 = new Period(9, 10);
        Period normalPeriod2 = new Period(14, 15);
        Period normalPeriod3 = new Period(16, 23);
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(normalPeriod1);
        normalPeriods.add(normalPeriod2);
        normalPeriods.add(normalPeriod3);

        Rate rate = new StaffRate(new BigDecimal(5.0), new BigDecimal(2.0), reducedPeriods, normalPeriods);
        Assert.assertNotNull(rate);
        rate.calculate(new Period(-1, 3));
    }

    /**
     * Calculate method Test Case Number: #3 - Condition2
     *
     * Given: The startHour of periodStay must greater than or equal to 0 and it less than or equals to 24,
     * 		  and  endHour of the periodStay must greater or equal to 0 and it less than or equals to 24
     * When: the instance of Rate is created by
     * 			- kind: STAFF
     * 			- normalRate: 5
     * 			- reducedRate: 2
     * 			- reducedPeriods: [(10, 13), (15, 16)]
     * 			- normalPeriods: [(9,10), (14, 15), (16, 23)]
     * 		  and the instance of periodStay is 21 for startHour and -2 for endHour
     * Then: Throw an IllegalArgumentException
     */
    @Test(expected = IllegalArgumentException.class)
    public void calculateTestCase3() {
        Period reducedPeriod1 = new Period(10, 13);
        Period reducedPeriod2 = new Period(15, 16);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(reducedPeriod1);
        reducedPeriods.add(reducedPeriod2);

        Period normalPeriod1 = new Period(9, 10);
        Period normalPeriod2 = new Period(14, 15);
        Period normalPeriod3 = new Period(16, 23);
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(normalPeriod1);
        normalPeriods.add(normalPeriod2);
        normalPeriods.add(normalPeriod3);

        Rate rate = new StaffRate(new BigDecimal(5.0), new BigDecimal(2.0), reducedPeriods, normalPeriods);
        Assert.assertNotNull(rate);
        rate.calculate(new Period(21, -2));
    }

    /**
     * Calculate method Test Case Number: #4 - Condition2
     *
     * Given: The startHour of periodStay must greater than or equal to 0 and it less than or equals to 24,
     * 		  and  endHour of the periodStay must greater or equal to 0 and it less than or equals to 24
     * When: the instance of Rate is created by
     * 			- kind: STAFF
     * 			- normalRate: 5
     * 			- reducedRate: 2
     * 			- reducedPeriods: [(10, 13), (15, 16)]
     * 			- normalPeriods: [(9,10), (14, 15), (16, 23)]
     * 		  and the instance of periodStay is 25 for startHour and 8 for endHour
     * Then: throw an IllegalArgumentException
     */
    @Test(expected = IllegalArgumentException.class)
    public void calculateTestCase4() {
        Period reducedPeriod1 = new Period(10, 13);
        Period reducedPeriod2 = new Period(15, 16);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(reducedPeriod1);
        reducedPeriods.add(reducedPeriod2);

        Period normalPeriod1 = new Period(9, 10);
        Period normalPeriod2 = new Period(14, 15);
        Period normalPeriod3 = new Period(16, 23);
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(normalPeriod1);
        normalPeriods.add(normalPeriod2);
        normalPeriods.add(normalPeriod3);

        Rate rate = new StaffRate(new BigDecimal(5.0), new BigDecimal(2.0), reducedPeriods, normalPeriods);
        Assert.assertNotNull(rate);
        rate.calculate(new Period(25, 8));
    }

    /**
     * Calculate method Test Case Number: #5 - Condition2
     *
     * Given: The startHour of periodStay must greater than or equal to 0 and it less than or equals to 24,
     * 		  and  endHour of the periodStay must greater or equal to 0 and it less than or equals to 24
     * When: the instance of Rate is created by
     * 			- kind: STAFF
     * 			- normalRate: 5
     * 			- reducedRate: 2
     * 			- reducedPeriods: [(10, 13), (15, 16)]
     * 			- normalPeriods: [(9,10), (14, 15), (16, 23)]
     * 		  and the instance of periodStay is 8 for startHour and 25 for endHour
     * Then: throw an IllegalArgumentException
     */
    @Test(expected = IllegalArgumentException.class)
    public void calculateTestCase5() {
        Period reducedPeriod1 = new Period(10, 13);
        Period reducedPeriod2 = new Period(15, 16);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(reducedPeriod1);
        reducedPeriods.add(reducedPeriod2);

        Period normalPeriod1 = new Period(9, 10);
        Period normalPeriod2 = new Period(14, 15);
        Period normalPeriod3 = new Period(16, 23);
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(normalPeriod1);
        normalPeriods.add(normalPeriod2);
        normalPeriods.add(normalPeriod3);

        Rate rate = new StaffRate(new BigDecimal(5.0), new BigDecimal(2.0), reducedPeriods, normalPeriods);
        Assert.assertNotNull(rate);
        rate.calculate(new Period(8, 25));
    }

    /**
     * Calculate method Test Case Number: #6 - Condition2
     *
     * Given: The startHour of periodStay must greater than or equal to 0 and it less than or equals to 24,
     * 		  and  endHour of the periodStay must greater or equal to 0 and it less than or equals to 24
     * When: the instance of Rate is created by
     * 			- kind: STAFF
     * 			- normalRate: 5
     * 			- reducedRate: 2
     * 			- reducedPeriods: [(10, 13), (15, 16)]
     * 			- normalPeriods: [(9,10), (14, 15), (16, 23)]
     * 		  and the instance of periodStay is 0 for startHour and 24 for endHour
     * Then: return an instance of BigDecimal and the value is 16
     */
    @Test
    public void calculateTestCase6() {
        Period reducedPeriod1 = new Period(10, 13);
        Period reducedPeriod2 = new Period(15, 16);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(reducedPeriod1);
        reducedPeriods.add(reducedPeriod2);

        Period normalPeriod1 = new Period(9, 10);
        Period normalPeriod2 = new Period(14, 15);
        Period normalPeriod3 = new Period(16, 23);
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(normalPeriod1);
        normalPeriods.add(normalPeriod2);
        normalPeriods.add(normalPeriod3);

        Rate rate = new StaffRate(new BigDecimal(5.0), new BigDecimal(2.0), reducedPeriods, normalPeriods);
        Assert.assertNotNull(rate);
        BigDecimal expectedCharge = rate.calculate(new Period(0, 24));
        Assert.assertTrue(expectedCharge.compareTo(new BigDecimal(16))==0);
    }

    /**
     * Calculate method Test Case Number: #7 - Condition3
     *
     * Given: The startHour of periodStay must less than endHour of the periodStay
     * When: the instance of Rate is created by
     * 			- kind: STAFF
     * 			- normalRate: 5.5
     * 			- reducedRate: 2.5
     * 			- reducedPeriods: [(10, 13), (15, 16)]
     * 			- normalPeriods: [(9,10), (14, 15), (16, 23)]
     * 		  and the instance of periodStay is 8 for startHour and 6 for endHour
     * Then: Throw an IllegalArgumentException
     */
    @Test(expected = IllegalArgumentException.class)
    public void calculateTestCase7() {
        Period reducedPeriod1 = new Period(10, 13);
        Period reducedPeriod2 = new Period(15, 16);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(reducedPeriod1);
        reducedPeriods.add(reducedPeriod2);

        Period normalPeriod1 = new Period(9, 10);
        Period normalPeriod2 = new Period(14, 15);
        Period normalPeriod3 = new Period(16, 23);
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(normalPeriod1);
        normalPeriods.add(normalPeriod2);
        normalPeriods.add(normalPeriod3);

        Rate rate = new StaffRate(new BigDecimal(5.5), new BigDecimal(2.5), reducedPeriods, normalPeriods);
        Assert.assertNotNull(rate);
        rate.calculate(new Period(8, 6));
    }

    /**
     * Calculate method Test Case Number: #8 - Condition3
     *
     * Given: The startHour of periodStay must less than endHour of the periodStay
     * When: the instance of Rate is created by
     * 			- kind: STAFF
     * 			- normalRate: 5.5
     * 			- reducedRate: 2.5
     * 			- reducedPeriods: [(10, 13), (15, 16)]
     * 			- normalPeriods: [(9,10), (14, 15), (16, 23)]
     * 		  and the instance of periodStay is 9 for startHour and 9 for endHour
     * Then: Throw an IllegalArgumentException
     */
    @Test(expected = IllegalArgumentException.class)
    public void calculateTestCase8() {
        Period reducedPeriod1 = new Period(10, 13);
        Period reducedPeriod2 = new Period(15, 16);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(reducedPeriod1);
        reducedPeriods.add(reducedPeriod2);

        Period normalPeriod1 = new Period(9, 10);
        Period normalPeriod2 = new Period(14, 15);
        Period normalPeriod3 = new Period(16, 23);
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(normalPeriod1);
        normalPeriods.add(normalPeriod2);
        normalPeriods.add(normalPeriod3);

        Rate rate = new StaffRate(new BigDecimal(5.5), new BigDecimal(2.5), reducedPeriods, normalPeriods);
        Assert.assertNotNull(rate);
        rate.calculate(new Period(9, 9));
    }

    /**
     * Calculate method Test Case Number: #9 - Condition3
     *
     * Given: The startHour of periodStay must greater than or equal to 0 and it less than or equals to 24,
     * 		  and  endHour of the periodStay must greater or equal to 0 and it less than or equals to 24
     * When: the instance of Rate is created by
     * 			- kind: STAFF
     * 			- normalRate: 5.5
     * 			- reducedRate: 2.5
     * 			- reducedPeriods: [(10, 13), (15, 16)]
     * 			- normalPeriods: [(9,10), (14, 15), (16, 23)]
     * 		  and the instance of periodStay is 16 for startHour and 20 for endHour
     * Then: return an instance of BigDecimal and the value is 16
     */
    @Test
    public void calculateTestCase9() {
        Period reducedPeriod1 = new Period(10, 13);
        Period reducedPeriod2 = new Period(15, 16);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(reducedPeriod1);
        reducedPeriods.add(reducedPeriod2);

        Period normalPeriod1 = new Period(9, 10);
        Period normalPeriod2 = new Period(14, 15);
        Period normalPeriod3 = new Period(16, 23);
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(normalPeriod1);
        normalPeriods.add(normalPeriod2);
        normalPeriods.add(normalPeriod3);

        Rate rate = new StaffRate(new BigDecimal(5.5), new BigDecimal(2.5), reducedPeriods, normalPeriods);
        Assert.assertNotNull(rate);
        BigDecimal expectedCharge = rate.calculate(new Period(16, 20));
        Assert.assertTrue(expectedCharge.compareTo(new BigDecimal(16))==0);
    }

    /**
     * Calculate method Test Case Number: #10 - Condition4
     *
     * Given: The periods of periodStay is not specified in both reducedPeriods and normalPeriods should free
     * When: the instance of Rate is created by
     * 			- kind: STAFF
     * 			- normalRate: 5.5
     * 			- reducedRate: 2.5
     * 			- reducedPeriods: [(10, 13), (15, 16)]
     * 			- normalPeriods: [(9,10), (14, 15), (16, 23)]
     * 		  and the instance of periodStay is 6 for startHour and 8 for endHour
     * Then: return an instance of BigDecimal and the value is 0
     */
    @Test
    public void calculateTestCase10() {
        Period reducedPeriod1 = new Period(10, 13);
        Period reducedPeriod2 = new Period(15, 16);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(reducedPeriod1);
        reducedPeriods.add(reducedPeriod2);

        Period normalPeriod1 = new Period(9, 10);
        Period normalPeriod2 = new Period(14, 15);
        Period normalPeriod3 = new Period(16, 23);
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(normalPeriod1);
        normalPeriods.add(normalPeriod2);
        normalPeriods.add(normalPeriod3);

        Rate rate = new StaffRate(new BigDecimal(5.5), new BigDecimal(2.5), reducedPeriods, normalPeriods);
        Assert.assertNotNull(rate);
        BigDecimal expectedCharge = rate.calculate(new Period(6, 8));
        Assert.assertTrue(expectedCharge.compareTo(new BigDecimal(0))==0);
    }

    /**
     * Calculate method Test Case Number: #11 - Condition4
     *
     * Given: The periods of periodStay is not specified in both reducedPeriods and normalPeriods should free
     * When: the instance of Rate is created by
     * 			- kind: STAFF
     * 			- normalRate: 5.5
     * 			- reducedRate: 2.5
     * 			- reducedPeriods: [(10, 13), (15, 16)]
     * 			- normalPeriods: [(9,10), (14, 15), (16, 23)]
     * 		  and the instance of periodStay is 6 for startHour and 10 for endHour
     * Then: return an instance of BigDecimal and the value is 5.5
     */
    @Test
    public void calculateTestCase11() {
        Period reducedPeriod1 = new Period(10, 13);
        Period reducedPeriod2 = new Period(15, 16);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(reducedPeriod1);
        reducedPeriods.add(reducedPeriod2);

        Period normalPeriod1 = new Period(9, 10);
        Period normalPeriod2 = new Period(14, 15);
        Period normalPeriod3 = new Period(16, 23);
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(normalPeriod1);
        normalPeriods.add(normalPeriod2);
        normalPeriods.add(normalPeriod3);

        Rate rate = new StaffRate(new BigDecimal(5.5), new BigDecimal(2.5), reducedPeriods, normalPeriods);
        Assert.assertNotNull(rate);
        BigDecimal expectedCharge = rate.calculate(new Period(6, 10));
        Assert.assertTrue(expectedCharge.compareTo(new BigDecimal(5.5))==0);
    }

    /**
     * Calculate method Test Case Number: #12 - Condition4
     *
     * Given: The periods of periodStay is not specified in both reducedPeriods and normalPeriods should free
     * When: the instance of Rate is created by
     * 			- kind: STAFF
     * 			- normalRate: 5.5
     * 			- reducedRate: 2.5
     * 			- reducedPeriods: [(10, 13), (15, 16)]
     * 			- normalPeriods: [(9,10), (14, 15), (16, 23)]
     * 		  and the instance of periodStay is 10 for startHour and 14 for endHour
     * Then: return an instance of BigDecimal and the value is 7.5
     */
    @Test
    public void calculateTestCase12() {
        Period reducedPeriod1 = new Period(10, 13);
        Period reducedPeriod2 = new Period(15, 16);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(reducedPeriod1);
        reducedPeriods.add(reducedPeriod2);

        Period normalPeriod1 = new Period(9, 10);
        Period normalPeriod2 = new Period(14, 15);
        Period normalPeriod3 = new Period(16, 23);
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(normalPeriod1);
        normalPeriods.add(normalPeriod2);
        normalPeriods.add(normalPeriod3);

        Rate rate = new StaffRate(new BigDecimal(5.5), new BigDecimal(2.5), reducedPeriods, normalPeriods);
        Assert.assertNotNull(rate);
        BigDecimal expectedCharge = rate.calculate(new Period(10, 14));
        Assert.assertTrue(expectedCharge.compareTo(new BigDecimal(7.5))==0);
    }

    /**
     * Calculate method Test Case Number: #13 - Condition4
     *
     * Given: The periods of periodStay is not specified in both reducedPeriods and normalPeriods should free
     * When: the instance of Rate is created by
     * 			- kind: STAFF
     * 			- normalRate: 5.5
     * 			- reducedRate: 2.5
     * 			- reducedPeriods: [(10, 13), (15, 16)]
     * 			- normalPeriods: [(9,10), (14, 15), (16, 23)]
     * 		  and the instance of periodStay is 6 for startHour and 13 for endHour
     * Then: return an instance of BigDecimal and the value is 13
     */
    @Test
    public void calculateTestCase13() {
        Period reducedPeriod1 = new Period(10, 13);
        Period reducedPeriod2 = new Period(15, 16);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(reducedPeriod1);
        reducedPeriods.add(reducedPeriod2);

        Period normalPeriod1 = new Period(9, 10);
        Period normalPeriod2 = new Period(14, 15);
        Period normalPeriod3 = new Period(16, 23);
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(normalPeriod1);
        normalPeriods.add(normalPeriod2);
        normalPeriods.add(normalPeriod3);

        Rate rate = new StaffRate(new BigDecimal(5.5), new BigDecimal(2.5), reducedPeriods, normalPeriods);
        Assert.assertNotNull(rate);
        BigDecimal expectedCharge = rate.calculate(new Period(6, 13));
        Assert.assertTrue(expectedCharge.compareTo(new BigDecimal(13))==0);
    }

    /**
     * Test the calculate of the Rate of Staff, Maximum payable is 16.00 per day.
     *
     * Given: The period of stay from 6 a.m to 13 p.m that payment should less than 16.00
     * When: the instance of StaffRate is created by
     * 			- normalRate: 5.5
     * 			- reducedRate: 2.5
     * 			- reducedPeriods: [(10, 16)]
     * 			- normalPeriods: [(9,10), (16, 23)]
     * 		  and the instance of periodStay is 6 for startHour and 13 for endHour
     * Then: return an instance of BigDecimal and the value is 12
     */
    @Test
    public void staffRateTestCase1(){
        Period reducedPeriod1 = new Period(10, 16);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(reducedPeriod1);

        Period normalPeriod1 = new Period(9, 10);
        Period normalPeriod2 = new Period(16, 23);
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(normalPeriod1);
        normalPeriods.add(normalPeriod2);

        Rate staffRate = new StaffRate(new BigDecimal(5.5), new BigDecimal(2.5), reducedPeriods, normalPeriods);
        Assert.assertNotNull(staffRate);

        RateContext context = new RateContext();
        context.setRate(staffRate);
        BigDecimal charge = context.calculate(new Period(6, 13));
        Assert.assertTrue(charge.compareTo(new BigDecimal(13))==0);
    }

    /**
     * Test the calculate of the Rate of Staff, Maximum payable is 16.00 per day.
     *
     * Given: The period of stay from 6 a.m to 20 p.m that payment should more than 16.00
     * When: the instance of StaffRate is created by
     * 			- normalRate: 5.5
     * 			- reducedRate: 2.5
     * 			- reducedPeriods: [(10, 16)]
     * 			- normalPeriods: [(9,10), (16, 23)]
     * 		  and the instance of periodStay is 6 for startHour and 20 for endHour
     * Then: return an instance of BigDecimal and the value is 16
     */
    @Test
    public void staffRateTestCase2(){
        Period reducedPeriod1 = new Period(10, 16);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(reducedPeriod1);

        Period normalPeriod1 = new Period(9, 10);
        Period normalPeriod2 = new Period(16, 23);
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(normalPeriod1);
        normalPeriods.add(normalPeriod2);

        Rate staffRate = new StaffRate(new BigDecimal(5.5), new BigDecimal(2.5), reducedPeriods, normalPeriods);
        Assert.assertNotNull(staffRate);

        RateContext context = new RateContext();
        context.setRate(staffRate);
        BigDecimal charge = context.calculate(new Period(6, 20));
        Assert.assertTrue(charge.compareTo(new BigDecimal(16))==0);
    }

    /**
     * Test the calculate of the Rate of Student, 25% reduction on any amount above 5.50.
     *
     * Given: The period of stay from 6 a.m to 13 p.m that payment should more than 5.50
     * When: the instance of StaffRate is created by
     * 			- normalRate: 5.5
     * 			- reducedRate: 2.5
     * 			- reducedPeriods: [(10, 16)]
     * 			- normalPeriods: [(9,10), (16, 23)]
     * 		  and the instance of periodStay is 6 for startHour and 13 for endHour
     * Then: return an instance of BigDecimal and the value is 11.125
     */
    @Test
    public void studentRateTestCase1(){
        Period reducedPeriod1 = new Period(10, 16);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(reducedPeriod1);

        Period normalPeriod1 = new Period(9, 10);
        Period normalPeriod2 = new Period(16, 23);
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(normalPeriod1);
        normalPeriods.add(normalPeriod2);

        Rate studentRate = new StudentRate(new BigDecimal(5.5), new BigDecimal(2.5), reducedPeriods, normalPeriods);
        Assert.assertNotNull(studentRate);

        RateContext context = new RateContext();
        context.setRate(studentRate);
        BigDecimal payment = context.calculate(new Period(6, 13));
        Assert.assertTrue(payment.compareTo(new BigDecimal(11.125)) == 0);

    }

    /**
     * Test the calculate of the Rate of Student, 25% reduction on any amount above 5.50.
     *
     * Given: The period of stay from 10 a.m to 12 p.m that payment should more than 5.50
     * When: the instance of StaffRate is created by
     * 			- normalRate: 5.5
     * 			- reducedRate: 2.5
     * 			- reducedPeriods: [(10, 16)]
     * 			- normalPeriods: [(9,10), (16, 23)]
     * 		  and the instance of periodStay is 10 for startHour and 12 for endHour
     * Then: return an instance of BigDecimal and the value is 5
     */
    @Test
    public void studentRateTestCase2(){
        Period reducedPeriod1 = new Period(10, 16);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(reducedPeriod1);

        Period normalPeriod1 = new Period(9, 10);
        Period normalPeriod2 = new Period(16, 23);
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(normalPeriod1);
        normalPeriods.add(normalPeriod2);

        Rate studentRate = new StudentRate(new BigDecimal(5.5), new BigDecimal(2.5), reducedPeriods, normalPeriods);
        Assert.assertNotNull(studentRate);

        RateContext context = new RateContext();
        context.setRate(studentRate);
        BigDecimal payment = context.calculate(new Period(10, 12));
        Assert.assertTrue(payment.compareTo(new BigDecimal(5)) == 0);

    }
}
