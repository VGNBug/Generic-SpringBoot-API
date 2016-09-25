package com.pawsey.api;

import com.pawsey.api.repository.BaseRepository;
import com.pawsey.api.service.BaseService;
import com.pawsey.api.service.impl.BaseServiceImpl;
import com.vgen.htmlutils.htmlformatter.HtmlUtils;
import org.springframework.context.annotation.Bean;

import java.io.Serializable;

public abstract class GenericApplication {

    protected HtmlUtils hu = new HtmlUtils();

    /** Placeholder home-page text. it is recommended that you replace this information about your own project. */
    protected String homeText =
            hu.paragraph(
                    "This project uses the " +
                    hu.link("Generic-SpringBoot-API", "https://github.com/VGNBug/Generic-SpringBoot-API", null)
                    + " as it's  template. For more information, follow the link, or contact the project's creator, " +
                    "Daniel Pawsey at " +
                    hu.link("daniel.pawsey@live.co.uk", "mailto:daniel.pawsey@live.co.uk", null),
                    null
            );

}
