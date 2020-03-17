package paivakirja.paivakirja;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


    @RestController
    @CrossOrigin(origins = "*")

    @RequestMapping("/api/topics")
    public class TopicController {

        @Autowired
        private TopicRepository tRepo;

        @GetMapping("")
        public Iterable <Topic> fetchAllTopics() {
            return tRepo.findAll();
        }

        @GetMapping("/{id}")
        public ResponseEntity<?> haeYksi(@PathVariable int id) {
            Optional<Topic> oh = tRepo.findById(id);
            if (oh.isPresent()) {
                return ResponseEntity.ok(oh.get());
            }
            return ResponseEntity.notFound().build();
        }


    @PostMapping("")
    public void addHenkilo(@RequestBody Topic t){
        tRepo.save(t);
    }

        @DeleteMapping(value = "/{id}")
        public ResponseEntity<Integer> deletePost(@PathVariable Integer id) {
            tRepo.deleteById(id);
            return ResponseEntity.ok(id);
        }

    }

