package com.saksham.SpringBootWebWalkthrough.beans;

import com.saksham.SpringBootWebWalkthrough.utils.DaoClass;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@Getter
@Setter

public class ThreadDao {
    private String threadName;
    private DaoClass dao;
}
