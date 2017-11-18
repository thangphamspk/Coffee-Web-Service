package com.thangphamspk.service;

import com.thangphamspk.entity.Staff;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StaffService {

    Staff addStaff(Staff staff);

    List<Staff> getStaffs();

    Staff getStaff(Integer id);
}
