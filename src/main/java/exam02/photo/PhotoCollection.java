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
        boolean found = false;
        for (Photo photo : photos) {
            if (photo.getName().equals(photoName)) {
                photo.setQuality(quality);
                found = true;
            }
       }
        if (!found) {
            throw new PhotoNotFoundException("Photo not found!");
        }
    }

    public int numberOfStars() {
        int numberOfPhotoStar = 0;
        for (Photo photo : photos) {
            if (photo.getQuality() == Quality.ONE_STAR) {
                numberOfPhotoStar++;
            }
            if (photo.getQuality() == Quality.TWO_STAR) {
                numberOfPhotoStar++;
                numberOfPhotoStar++;
            }
        }
        return numberOfPhotoStar;
    }

    public static void main(String[] args) {
        PhotoCollection photoCollection = new PhotoCollection();
        photoCollection.addPhoto("a.jpg", "b.jpg", "c.jpg");
        photoCollection.starPhoto("a.jpg", Quality.TWO_STAR);
        photoCollection.starPhoto("a.jpg", Quality.ONE_STAR);
    }
}
