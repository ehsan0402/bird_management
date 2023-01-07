package ir.tarannom.luna.bird.persistence

import jakarta.persistence.*
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size

@Entity
@Table(name = "province")
class Province {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    var id: Int? = null

    @Size(max = 50)
    @NotNull
    @Column(name = "name", nullable = false, length = 50, unique = true)
    var name: String? = null
}