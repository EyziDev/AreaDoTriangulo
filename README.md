# AreaDoTriangulo
Este projeto em Java calcula e compara as áreas de dois triângulos usando a fórmula de Herão. Estruturado com Programação Orientada a Objetos (POO), o código também utiliza boas práticas de entrada/saída de dados.

```mermaid
graph LR
    A[Início] --> B{Verifica Lados}
    B --> C[Calcula a Área X]
    B --> D[Calcula a Área Y]
    C --> E{Área X maior?}
    D --> E
    E --> F[Exibe Resultado]
    F --> G[Fim]
