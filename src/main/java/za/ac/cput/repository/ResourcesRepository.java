package za.ac.cput.repository;

/*
   Titilayo Nikelwa Ore-ofe Akinjole - 220283982
*/

import za.ac.cput.entity.Resources;

import java.util.HashSet;
import java.util.Set;


public class ResourcesRepository implements IResourcesRepository {

    private static ResourcesRepository repository = null;
    private Set<Resources> resourcesDB = null;

    private ResourcesRepository() {
        resourcesDB = new HashSet<Resources>();
    }

    public static ResourcesRepository getRepository(){
        if (repository == null){
            repository = new ResourcesRepository();
        }
        return repository;
    }

    @Override
    public Resources create(Resources resources) {
        return null;
    }

    @Override
    public Resources read(String resources_id) {
        Resources resources = resourcesDB.stream()
                .filter(r -> r.getResources_id().equals(resources_id))
                .findAny().orElse(null);
        return resources;
    }

    @Override
    public Resources update(Resources resources) {
        Resources oldResources = read(resources.getResources_id());
        if (oldResources != null) {
            resourcesDB.remove(oldResources);
            resourcesDB.add(resources);
            return resources;
        }
        return null;
    }
    @Override
    public boolean delete(String resources_id) {
        Resources resourcesDelete = read(resources_id);
        if (resourcesDelete == null){
            return false;
        }
        resourcesDB.remove(resourcesDelete);
        return true;
    }
    @Override
    public Set<Resources> getAll() { return resourcesDB; }
}
