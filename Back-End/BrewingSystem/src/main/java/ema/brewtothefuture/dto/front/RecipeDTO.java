package ema.brewtothefuture.dto.front;

import ema.brewtothefuture.dto.api.DTO;

import java.util.List;

public record RecipeDTO(
        String user_id,
        String recipe_name,
        String method,
        String style,
        double abv,
        double ibu,
        double original_gravity,
        double final_gravity,
        double color,
        int batch_size_liter,
        List<RecipeStepDTO> recipe,
        List<NotificationDTO> notifications,
        List<FermentableDTO> fermentables,
        List<HopDTO> hops,
        List<YeastDTO> yeast
) implements DTO { }