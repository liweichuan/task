package com.jnshu.ServiceImpl;

import com.jnshu.Dao.ProfessionMapper;
import com.jnshu.Entity.Profession;
import com.jnshu.Service.ProfessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessionServiceImpl implements ProfessionService {
    @Autowired
    ProfessionMapper professionMapper;
    @Override
    public List<Profession> getListProfession() {
        return professionMapper.getListProfession();
    }

}
