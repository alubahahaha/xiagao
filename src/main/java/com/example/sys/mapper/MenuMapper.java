package com.example.sys.mapper;

import com.example.sys.entity.Mainmenu;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuMapper {
    public List<Mainmenu> getMenus();
}
