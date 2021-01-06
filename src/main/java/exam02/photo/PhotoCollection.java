package exam02.photo;

import java.util.ArrayList;
import java.util.List;

public class PhotoCollection {
    private List<Photo> photos = new ArrayList<>();

    public void addPhoto(String... photos) {
        for (String photo : photos) {
            this.photos.add(new Photo(photo));
        }
    }

    public List<Photo> getPhotos() {
        return photos;
    }

    public void starPhoto(String photoName, Quality quality) {
        try {
            for (Photo photo : photos) {
                if (photo.getName().equals(photoName)) {
                    photo.setQuality(quality);
                }
            }
        } catch (PhotoNotFoundException e){
            throw new PhotoNotFoundException("Not find a phot", e);
        }
    }

    public int numberOfStars() {

        return 0;
    }
}
