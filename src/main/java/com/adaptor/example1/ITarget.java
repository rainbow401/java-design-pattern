package com.adaptor.example1;

/**
 * 适配器接口定义，对sdk进行重构的定义
 */
public interface ITarget {
    void function1();
    void function2();
    void function3(ParamsWrapperDefinition paramWrapper);
    void function4();
}
