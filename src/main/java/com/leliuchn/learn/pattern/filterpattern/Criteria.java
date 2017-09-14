package com.leliuchn.learn.pattern.filterpattern;

import java.util.List;

/**
 * Created by leliuchn on 16/11/22.
 */

////这个模式很有用，过程中经常使用各种条件来过滤，提供了一种简单有趣的模式设计方法。
public interface Criteria {

    public List<Person> meetCriteria(List<Person> persons);
}
