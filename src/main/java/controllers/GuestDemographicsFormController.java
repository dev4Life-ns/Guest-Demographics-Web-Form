package controllers;


import com.reservations.guestdemographicsform.DemographicsData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Controller
@RequestMapping("/demographics_form")
@SessionAttributes("demographicsData")

public class GuestDemographicsFormController {

    @ModelAttribute(name = "demographicsData")
    public DemographicsData demographicsData() {
        return new DemographicsData();
    }

    @GetMapping
    public String showDemographicsForm(){
        return "demographics_form";
    }


    @PostMapping("/demographics_form")
    public String demographicsFormSubmitted(@ModelAttribute("demographicsData") DemographicsData demographicsData, Model model) {
        model.addAttribute("demographicsData", demographicsData);
        return "submissionform";
    }

}
