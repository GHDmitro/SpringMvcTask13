package ua.kiev.prog;

import com.sun.javafx.sg.prism.NGShape;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class MyController {
    static final int DEFAULT_GROUP_ID = -1;

    @Autowired
    private UserService userService;
//    private ContactService contactService;

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("users", userService.listUsers());
        return "index";
    }

//    @RequestMapping("/contact_add_page")
//    public String contactAddPage(Model model) {
//        model.addAttribute("groups", contactService.listGroups());
//        return "contact_add_page";
//    }
//
//    @RequestMapping("/group_add_page")
//    public String groupAddPage() {
//        return "group_add_page";
//    }

//    @RequestMapping("/group/{id}")
//    public String listGroup(@PathVariable(value = "id") long groupId, Model model) {
//        Group group = (groupId != DEFAULT_GROUP_ID) ? contactService.findGroup(groupId) : null;
//
//        model.addAttribute("groups", contactService.listGroups());
//        model.addAttribute("currentGroup", group);
//        model.addAttribute("contacts", contactService.listContacts(group));
//        return "index";
//    }
//
//
//
//    @RequestMapping(value = "/search", method = RequestMethod.POST)
//    public String search(@RequestParam String pattern, Model model) {
//        model.addAttribute("groups", contactService.listGroups());
//        model.addAttribute("contacts", contactService.searchContacts(pattern));
//        return "index";
//    }
//
//
//    @RequestMapping(value = "/contact/delete", method = RequestMethod.POST)
//    public String search(@RequestParam(value = "toDelete[]", required = false) long[] toDelete, Model model) {
//        if (toDelete != null)
//            contactService.deleteContact(toDelete);
//
//        model.addAttribute("groups", contactService.listGroups());
//        model.addAttribute("contacts", contactService.listContacts(null));
//        return "index";
//    }
//
//    @RequestMapping(value="/contact/add", method = RequestMethod.POST)
//    public String contactAdd(@RequestParam(value = "group") long groupId,
//                             @RequestParam String name,
//                             @RequestParam String surname,
//                             @RequestParam String phone,
//                             @RequestParam String email,
//                             Model model)
//    {
//        Group group = (groupId != DEFAULT_GROUP_ID) ? contactService.findGroup(groupId) : null;
//
//        Contact contact = new Contact(group, name, surname, phone, email);
//        contactService.addContact(contact);
//
//        model.addAttribute("groups", contactService.listGroups());
//        model.addAttribute("contacts", contactService.listContacts(null));
//        return "index";
//    }

    @RequestMapping(value = "/userAdd", method = RequestMethod.POST)
    public String userAdd(@RequestParam String name, @RequestParam int age, Model model) {
//        contactService.addGroup(new Group(name));

        userService.addUser(new User(name, age));
        model.addAttribute("users", userService.listUsers());

//        model.addAttribute("groups", contactService.listGroups());
//        model.addAttribute("contacts", contactService.listContacts(null));
        return "index";
    }


}
