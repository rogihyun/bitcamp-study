// JSON 콘텐트 입력받기 - @RestController
package bitcamp.app2;

import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/error")
public class ErrorController {

  @RequestMapping
  public ModelAndView error(HttpServletRequest request) {
    ModelAndView mv =  new ModelAndView();
    mv.addObject("status", request.getAttribute("javax.servlet.error.status_code"));
    mv.addObject("reason", request.getAttribute("javax.servlet.error.message"));
    mv.setViewName("error2");
    return mv;

  }
}











