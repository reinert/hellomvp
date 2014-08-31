package com.hellomvp.client.mvp;

import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.gwt.place.shared.WithTokenizers;
import com.hellomvp.client.place.GoodbyePlace;
import com.hellomvp.client.place.HelloPlace;
import com.hellomvp.client.place.UsersPlace;

/**
 * PlaceHistoryMapper interface is used to attach all places which the
 * PlaceHistoryHandler should be aware of. This is done via the @WithTokenizers
 * annotation or by extending PlaceHistoryMapperWithFactory and creating a
 * separate TokenizerFactory.
 */
@WithTokenizers({HelloPlace.Tokenizer.class,
                 GoodbyePlace.Tokenizer.class,
                 UsersPlace.Tokenizer.class})
public interface AppPlaceHistoryMapper extends PlaceHistoryMapper {
}
