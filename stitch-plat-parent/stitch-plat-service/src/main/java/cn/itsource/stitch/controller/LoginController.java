package cn.itsource.stitch.controller;


import cn.itsource.stitch.domain.User;
import cn.itsource.stitch.util.AjaxResult;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {

    @PostMapping("/login")
    public AjaxResult login(@RequestBody User user) {
        String username = user.getUsername();
        String password = user.getPassword();
        //假登录
        if ("admin".equals(username) && "admin".equals(password)) {
            return AjaxResult.me().setSuccess(true).setMessage("登录成功!").setRestObj(user);
        }
        return AjaxResult.me().setSuccess(false).setMessage("登录失败!");
    }


}