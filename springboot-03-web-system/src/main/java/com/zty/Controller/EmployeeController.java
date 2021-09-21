package com.zty.Controller;

import com.zty.dao.DepartmentMapper;
import com.zty.dao.EmployeeMapper;
import com.zty.pojo.Department;
import com.zty.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.Collection;

@Controller
public class EmployeeController {
    @Autowired
    EmployeeMapper employeeDao;
    @Autowired
    DepartmentMapper departmentMapper;

    @RequestMapping("/emps")
    public String list(Model model){
        Collection<Employee> employees = employeeDao.getALL();
        model.addAttribute("emps",employees);
        return "emp/list";
    }
    //to员工添加页面
    @GetMapping("/emp")
    public String toAddPage(Model model){
        //查询所有的部门信息
        Collection<Department> departments = departmentMapper.getDepartments();
        model.addAttribute("departments",departments);
        return "emp/add";
    }
    //员工添加功能
//接收前端传递的参数，自动封装成为对象[要求前端传递的参数名，和属性名一致]
    @PostMapping("/emp")
    public String addEmp(Employee employee){
        //保存员工的信息
        System.out.println(employee);
        employeeDao.save(employee);
        // 回到员工列表页面，可以使用redirect或者forward，就不会被视图解析器解析
        return "redirect:/emps";
    }


    //员工修改页面
    @GetMapping("/emp/{id}")
    public String toUpdateEmp(@PathVariable("id") Integer id, Model model){
        Employee employee = employeeDao.getEmployeeById(id);
        model.addAttribute("emp",employee);

        //查询所有的部门信息
        Collection<Department> departments = departmentMapper.getDepartments();
        model.addAttribute("departments",departments);
        return "emp/update";
    }

    //删除员工
    @GetMapping("/delEmp/{id}")
    public String delEmp(@PathVariable("id") Integer id){
        employeeDao.delete(id);
        return "redirect:/emps";
    }
    @RequestMapping("/user/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "redirect:/index.html";
    }
}
