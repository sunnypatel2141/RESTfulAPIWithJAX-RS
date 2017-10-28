package org.jaxrs.messenger.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jaxrs.messenger.database.DatabaseClass;
import org.jaxrs.messenger.model.Profile;;

public class ProfileService
{
	private Map<String, Profile> profiles = DatabaseClass.getProfiles();

	public ProfileService()
	{
		profiles.put("Sunny's Profile", new Profile(1L, "Sunny's Profile", "Sunny", "Patel"));
	}
	
	public Profile getProfile(String profileName)
	{
		return profiles.get(profileName);
	}
	
	public Profile addProfile(Profile profile)
	{
		profile.setId(profiles.size() + 1);
		profiles.put(profile.getProfileName(), profile);
		return profile;
	}
	
	public Profile updateProfile (Profile profile)
	{
		if (profile.getProfileName().isEmpty())
		{
			return null;
		}
		profiles.put(profile.getProfileName(), profile);
		return profile;
	}
	
	public Profile removeProfile(String profileName)
	{
		return profiles.remove(profileName);
	}
	
	public List<Profile> getAllprofiles()
	{
		return new ArrayList<>(profiles.values());
	}	
}
