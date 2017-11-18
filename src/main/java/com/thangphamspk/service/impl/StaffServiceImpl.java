package com.thangphamspk.service.impl;

import com.thangphamspk.entity.Staff;
import com.thangphamspk.repository.StaffRepository;
import com.thangphamspk.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffServiceImpl implements StaffService {

    @Autowired
    private StaffRepository staffRepository;

    public StaffServiceImpl() {
    }

    public StaffRepository getUserRepository() {
        return staffRepository;
    }

    public void setUserRepository(StaffRepository userRepository) {
        this.staffRepository = userRepository;
    }


    @Override
    public Staff addStaff(Staff staff) {
        return staffRepository.save(staff);
    }

    @Override
    public List<Staff> getStaffs() {
        return staffRepository.findAll();
    }

    @Override
    public Staff getStaff(Integer id) {
        return staffRepository.findOne(id);
    }

}
