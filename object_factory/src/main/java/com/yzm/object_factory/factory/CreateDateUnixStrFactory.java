package com.yzm.object_factory.factory;

import com.yzm.object_factory.entity.User;
import org.apache.ibatis.reflection.factory.DefaultObjectFactory;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class CreateDateUnixStrFactory extends DefaultObjectFactory {
    private static final long serialVersionUID = 8653925955845038466L;

    @Override
    public <T> T create(Class<T> type) {
        if (type == User.class) {
            User user = (User) super.create(type);
            // 如果是用户类 先创建实例
            // 在这个时候，user是里面的值是空值 create只是创建新的实例，并没有赋值，而是在后面赋值
            // 所以如果利用objectFactory进行设置实例的值，需要考虑后面赋值会产生覆盖
            // 但是这里可以进行赋值一些数据库不存在的字段
            user.setNoExistField("数据库不存在的字段，在创建实例对象时进行赋值");
            return (T) user;
        }
        return super.create(type);
    }

    @Override
    public <T> T create(Class<T> type, List<Class<?>> constructorArgTypes, List<Object> constructorArgs) {
        return super.create(type, constructorArgTypes, constructorArgs);
    }

    @Override
    protected Class<?> resolveInterface(Class<?> type) {
        return super.resolveInterface(type);
    }

    @Override
    public <T> boolean isCollection(Class<T> type) {
        return super.isCollection(type);
    }
}
