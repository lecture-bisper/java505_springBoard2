package com.bitc.board2.controller;

import com.bitc.board2.dto.AreaDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class AjaxController {

  @RequestMapping(value = "/ajax/nonAjaxCalView", method = RequestMethod.GET)
  public String nonAjaxCalView() throws Exception {
    return "ajax/nonAjaxCalView";
  }

  @RequestMapping(value = "/ajax/nonAjaxCalResult", method = RequestMethod.GET)
  public ModelAndView nonAjaxCalResult(@RequestParam("num1") int num1, @RequestParam("num2") int num2) throws Exception {
    ModelAndView mv = new ModelAndView("ajax/nonAjaxCalResult");

    int result = num1 + num2;
    mv.addObject("result", result);

    return mv;
  }

  @RequestMapping(value = "/ajax/ajaxCalView", method = RequestMethod.GET)
  public String ajaxCalView() throws Exception {
    return "ajax/ajaxCalView";
  }

  @ResponseBody
  @RequestMapping(value = "/ajax/ajaxCalResult", method = RequestMethod.POST)
  public Object ajaxCalResult(@RequestParam("num1") int num1, @RequestParam("num2") int num2) throws Exception {
    int result = num1 + num2;

//    Map<String, String> result = new HashMap<>();
//    result.put("result", "success");
//    result.put("value", String.valueOf(num1 + num2));

    return result;
  }

  @RequestMapping(value = "/ajax/selectbox", method = RequestMethod.GET)
  public String selectBox() throws Exception {
    return "ajax/selectbox";
  }

  @ResponseBody
  @RequestMapping(value = "/ajax/selectbox1", method = RequestMethod.POST)
  public Object box1Selected(AreaDto area) throws Exception {
    List<AreaDto> areaList = new ArrayList<>();

    if (area.getAreaName().equals("??????")) {
      AreaDto se1 = new AreaDto();
      AreaDto se2 = new AreaDto();
      AreaDto se3 = new AreaDto();
      AreaDto se4 = new AreaDto();

      se1.setAreaName("?????????");
      se2.setAreaName("?????????");
      se3.setAreaName("?????????");
      se4.setAreaName("?????????");

      areaList.add(se1);
      areaList.add(se2);
      areaList.add(se3);
      areaList.add(se4);
    }
    else if (area.getAreaName().equals("??????")) {
      AreaDto dj1 = new AreaDto();
      AreaDto dj2 = new AreaDto();
      AreaDto dj3 = new AreaDto();
      AreaDto dj4 = new AreaDto();

      dj1.setAreaName("??????");
      dj2.setAreaName("??????");
      dj3.setAreaName("??????");
      dj4.setAreaName("?????????");

      areaList.add(dj1);
      areaList.add(dj2);
      areaList.add(dj3);
      areaList.add(dj4);
    }
    else if (area.getAreaName().equals("??????")) {
      AreaDto dg1 = new AreaDto();
      AreaDto dg2 = new AreaDto();
      AreaDto dg3 = new AreaDto();
      AreaDto dg4 = new AreaDto();

      dg1.setAreaName("?????????");
      dg2.setAreaName("?????????");
      dg3.setAreaName("?????????");
      dg4.setAreaName("??????");

      areaList.add(dg1);
      areaList.add(dg2);
      areaList.add(dg3);
      areaList.add(dg4);
    }
    else if (area.getAreaName().equals("??????")) {
      AreaDto ps1 = new AreaDto();
      AreaDto ps2 = new AreaDto();
      AreaDto ps3 = new AreaDto();
      AreaDto ps4 = new AreaDto();

      ps1.setAreaName("????????????");
      ps2.setAreaName("????????????");
      ps3.setAreaName("?????????");
      ps4.setAreaName("?????????");

      areaList.add(ps1);
      areaList.add(ps2);
      areaList.add(ps3);
      areaList.add(ps4);
    }

    return areaList;
  }

  @ResponseBody
  @RequestMapping(value = "/ajax/selectbox2", method = RequestMethod.POST)
  public Object selectBox2(@RequestParam("area") String area) {
    List<AreaDto> areaList = new ArrayList<>();

    AreaDto ad1 = new AreaDto();
    AreaDto ad2 = new AreaDto();

    switch (area) {
      case "?????????":
        ad1.setAreaName("??????1???");
        ad2.setAreaName("??????2???");
        break;
      case "?????????":
        ad1.setAreaName("??????1???");
        ad2.setAreaName("??????2???");
        break;
      case "?????????":
        ad1.setAreaName("??????1???");
        ad2.setAreaName("??????2???");
        break;
      case "?????????":
        ad1.setAreaName("??????1???");
        ad2.setAreaName("??????2???");
        break;

      case "??????":
        ad1.setAreaName("???1???");
        ad2.setAreaName("???2???");
        break;
      case "??????":
        ad1.setAreaName("???1???");
        ad2.setAreaName("???2???");
        break;
      case "??????":
        ad1.setAreaName("???1???");
        ad2.setAreaName("???2???");
        break;
      case "?????????":
        ad1.setAreaName("??????1???");
        ad2.setAreaName("??????2???");
        break;

      case "?????????":
        ad1.setAreaName("??????1???");
        ad2.setAreaName("??????2???");
        break;
      case "?????????":
        ad1.setAreaName("??????1???");
        ad2.setAreaName("??????2???");
        break;
      case "?????????":
        ad1.setAreaName("??????1???");
        ad2.setAreaName("??????2???");
        break;
      case "?????????":
        ad1.setAreaName("??????1???");
        ad2.setAreaName("??????2???");
        break;

      case "????????????":
        ad1.setAreaName("??????1???");
        ad2.setAreaName("??????2???");
        break;
      case "????????????":
        ad1.setAreaName("??????1???");
        ad2.setAreaName("??????2???");
        break;
      case "?????????":
        ad1.setAreaName("??????1???");
        ad2.setAreaName("??????2???");
        break;
      case "?????????":
        ad1.setAreaName("??????1???");
        ad2.setAreaName("??????2???");
        break;
    }

    areaList.add(ad1);
    areaList.add(ad2);

    return areaList;
  }
}









