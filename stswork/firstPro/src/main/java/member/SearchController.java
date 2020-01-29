package member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class SearchController {
	@RequestMapping("/search.do")
	public ModelAndView search(String search) {//(index.jsp 파라미터 이름과 같은 것을 변수로 받아옴)
		System.out.println("검색어:"+search);
		return new ModelAndView("test/index");
	}

}
