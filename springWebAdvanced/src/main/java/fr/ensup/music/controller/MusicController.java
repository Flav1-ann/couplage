package fr.ensup.music.controller;

import fr.ensup.music.domain.Music;
import fr.ensup.music.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MusicController {

    @Autowired
    private MusicService musicService;

    @GetMapping("/music")
    public String musicForm(Model model){
        model.addAttribute("music",new Music());
        return "createMusic";
    }

    @PostMapping("/music")
    public String musicSubmit(@ModelAttribute("music") Music music, Model model){
        System.out.println(music);
        musicService.save(music);
        return "redirect:/";
    }


}
