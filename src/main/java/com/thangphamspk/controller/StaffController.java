package com.thangphamspk.controller;

import com.thangphamspk.entity.Staff;
import com.thangphamspk.exception.ObjectNotFoundException;
import com.thangphamspk.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class StaffController {

    @Autowired
    private StaffService staffService;

    @GetMapping("/staffs")
    public List<Staff> getStaffs() {
        return staffService.getStaffs();
    }

    @GetMapping("/staffs/{id}")
    public Staff getStaff(@PathVariable int id) {
        Staff staff = staffService.getStaff(id);
        if (staff == null) {
            throw new ObjectNotFoundException("Could not find Staff with id: " + id);
        }
        return staff;
    }

    @PostMapping("/staffs")
    public Staff createStaff(@Valid @RequestBody Staff staff) {
        return staffService.addStaff(staff);
    }
}
