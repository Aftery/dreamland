package top.aftery.controller;

import org.apache.ibatis.session.defaults.DefaultSqlSession;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import top.aftery.common.CodeCaptchaServlet;
import top.aftery.entity.User;
import top.aftery.service.UserService;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName RegisterController
 * @Description TODO
 * @AUTHOR Aftery
 * @Date 2019-07-11
 **/
@Controller
@SuppressWarnings("all")
public class RegisterController {
    private final static Logger log = Logger.getLogger(RegisterController.class);

    @Autowired
    private UserService userService;

    @RequestMapping("/checkPhone")
    @ResponseBody
    public Map<String, Object> checkPhone(Model model, @RequestParam(value = "phone", required = false) String phone) {
        log.debug("注册-判断手机号" + phone + ":是否可用");
        Map map = new HashMap<String, Object>();
        User user = userService.findByPhone(phone);
        if (user == null) {
            //为注册
            map.put("message", "success");
        } else {
            //未注册
            map.put("message", "fail");
        }
        return map;
    }

    @RequestMapping("/checkCode")
    @ResponseBody
    public Map<String,Object> checkCode(Model model,@RequestParam(value = "code",required = false) String code){
        log.debug("注册-判断验证码" + code + ":是否可用");
        Map map = new HashMap<String, Object>();
        ServletRequestAttributes attrs = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        String vcode = (String) attrs.getRequest().getSession().getAttribute(CodeCaptchaServlet.VERCODE_KEY);
        if (vcode == null) {
            //为注册
            map.put("message", "success");
        } else {
            //未注册
            map.put("message", "fail");
        }
        return map;
    }
}
