package com.nolaurence.Service;


import com.nolaurence.entity.User;
import com.nolaurence.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nolaurence.api.TestService;

@Service
public class TestServiceImpl implements TestMapper {
    @Autowired
    private TestMapper testMapper;

    @Override
    public User getUserById(Integer id) {
        return testMapper.getUserById(id);
    }

}
