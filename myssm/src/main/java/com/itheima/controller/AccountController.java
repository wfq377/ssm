package com.itheima.controller;


import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("account")
public class AccountController {

    //调用service
    @Autowired
    private AccountService accountService;

    //查询所有
    @RequestMapping("findAll")
    public String findAll(Model model){
        System.out.println("表现层 查询所有...");
        List<Account> list = accountService.findAll();
        model.addAttribute("list",list);
        return "list";
    }
    //添加用户
    @RequestMapping("saveAccount")
    public void saveAccount(Account account, HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("表现层 添加用户...");
        accountService.saveAccount(account);
        //重定向到查询所有
        response.sendRedirect(request.getContextPath()+"/account/findAll");
    }
}
