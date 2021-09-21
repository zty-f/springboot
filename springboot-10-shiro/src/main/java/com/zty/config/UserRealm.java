package com.zty.config;

import com.zty.pojo.User;
import com.zty.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;

//自定义的UserRealm
public class UserRealm extends AuthorizingRealm {

    @Autowired
    private UserService userService;

    //授权
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println("执行了=>授权doGetAuthorizationInfo");

        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();

        //拿到当前登录的这个对象
        Subject subject = SecurityUtils.getSubject();
        User currentUser = (User)subject.getPrincipal();//拿到user对象

        //设置当前用户的权限
        info.addStringPermission(currentUser.getPerms());

        return info;
    }

    //认证
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        System.out.println("执行了=>认证doGetAuthorizationInfo");
        // 用户名、密码， 数据中取
        UsernamePasswordToken userToken = (UsernamePasswordToken) token;

        // 真实数据库 用户名、密码， 数据中取
        User user = userService.queryUserByName(userToken.getUsername());

        if (user == null) {//没有这个人
            return null;
        }


        // 密码认证，shiro做
        return new SimpleAuthenticationInfo(user,user.getPwd(),"");
    }
}
