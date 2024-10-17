package com.uralhalil.jte.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserProfileController {

    private final UserProfileRepository userProfileRepository;

    @Autowired
    public UserProfileController(UserProfileRepository userProfileRepository) {
        this.userProfileRepository = userProfileRepository;
    }

    @GetMapping("/profile")
    public String showProfileForm(Model model) {

        UserProfile user;
        if (userProfileRepository.exists()) {
            user = userProfileRepository.get();
        } else {
            user = new UserProfile("", "", "");
        }
        model.addAttribute("model", user);
        return "profile";
    }

    @PostMapping("/profile")
    public String submitProfile(@RequestParam("name") String name, @RequestParam("surname") String surname,
                                @RequestParam("email") String email, @RequestParam(value = "success", required =
            false) String success, Model model) {

        // Save the submitted user profile data
        UserProfile user = new UserProfile(name, surname, email);
        userProfileRepository.save(user);

        // Check if submission was successful
        if ("true".equals(success)) {
            model.addAttribute("showSuccessPopup", true);
        }

        model.addAttribute("model", user);
        return "redirect:/profile"; // Return to the profile page with updated data

    }

}