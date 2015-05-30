package demo.controller;

import demo.domain.Entity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * @author okulyk
 */
@RestController()
@RequestMapping("/entities")
public class EntityController {

    @RequestMapping(value = "/{id}", method = GET)
    public Entity get(@PathVariable("id") int id) {
        return new Entity(id);
    }

}
