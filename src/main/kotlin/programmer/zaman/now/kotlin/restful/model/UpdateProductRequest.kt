package programmer.zaman.now.kotlin.restful.model

import javax.validation.constraints.Min
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull

data class UpdateProductRequest(

        @NotBlank
        val name: String?,

        @NotNull
        @Min(1)
        val price: Long?,

        @NotNull
        @Min(0)
        val quantity: Int?

)