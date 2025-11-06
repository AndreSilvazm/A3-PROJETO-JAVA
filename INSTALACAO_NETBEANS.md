# Guia de Instalação do NetBeans e Execução de Projetos Java

Este documento fornece instruções detalhadas sobre como instalar o NetBeans IDE e executar projetos Java.

## Índice
1. [Pré-requisitos](#pré-requisitos)
2. [Instalação do JDK](#instalação-do-jdk)
3. [Instalação do NetBeans](#instalação-do-netbeans)
4. [Como Abrir o Projeto no NetBeans](#como-abrir-o-projeto-no-netbeans)
5. [Como Executar o Projeto](#como-executar-o-projeto)
6. [Solução de Problemas](#solução-de-problemas)

---

## Pré-requisitos

Antes de instalar o NetBeans, você precisa ter o Java Development Kit (JDK) instalado no seu computador.

### Requisitos de Sistema
- **Sistema Operacional**: Windows 7 ou superior, macOS 10.9 ou superior, ou Linux
- **Memória RAM**: Mínimo de 2 GB (recomendado 4 GB ou mais)
- **Espaço em Disco**: Mínimo de 1 GB de espaço livre
- **JDK**: Versão 8 ou superior (recomendado JDK 11 ou JDK 17)

---

## Instalação do JDK

### Windows

1. **Baixar o JDK**
   - Acesse o site oficial da Oracle: https://www.oracle.com/java/technologies/downloads/
   - Ou use o OpenJDK: https://adoptium.net/
   - Selecione a versão do JDK (recomendado: JDK 17 LTS)
   - Baixe o instalador para Windows (arquivo .exe)

2. **Instalar o JDK**
   - Execute o arquivo baixado
   - Siga as instruções do instalador
   - Anote o caminho de instalação (geralmente `C:\Program Files\Java\jdk-17`)

3. **Configurar Variáveis de Ambiente**
   - Abra o "Painel de Controle"
   - Vá em "Sistema e Segurança" → "Sistema" → "Configurações avançadas do sistema"
   - Clique em "Variáveis de Ambiente"
   - Em "Variáveis do sistema", clique em "Novo" e adicione:
     - Nome: `JAVA_HOME`
     - Valor: `C:\Program Files\Java\jdk-17` (ou o caminho onde você instalou)
   - Encontre a variável "Path", clique em "Editar" e adicione:
     - `%JAVA_HOME%\bin`
   - Clique em "OK" em todas as janelas

4. **Verificar a Instalação**
   - Abra o Prompt de Comando (cmd)
   - Digite: `java -version`
   - Digite: `javac -version`
   - Se aparecer a versão do Java, a instalação foi bem-sucedida

### macOS

1. **Baixar o JDK**
   - Acesse https://adoptium.net/
   - Baixe a versão .pkg para macOS

2. **Instalar o JDK**
   - Abra o arquivo .pkg baixado
   - Siga as instruções do instalador

3. **Verificar a Instalação**
   - Abra o Terminal
   - Digite: `java -version`
   - Digite: `javac -version`

### Linux (Ubuntu/Debian)

1. **Instalar via Terminal**
   ```bash
   sudo apt update
   sudo apt install default-jdk
   ```

2. **Verificar a Instalação**
   ```bash
   java -version
   javac -version
   ```

---

## Instalação do NetBeans

### Método 1: Instalador Oficial (Recomendado)

#### Windows, macOS e Linux

1. **Baixar o NetBeans**
   - Acesse o site oficial: https://netbeans.apache.org/download/
   - Escolha a versão mais recente (recomendado: Apache NetBeans 19 ou superior)
   - Selecione o instalador apropriado para seu sistema operacional:
     - **Windows**: arquivo .exe
     - **macOS**: arquivo .dmg
     - **Linux**: arquivo .sh ou binário

2. **Instalar no Windows**
   - Execute o arquivo .exe baixado
   - Clique em "Next" (Próximo)
   - Aceite os termos de licença
   - O instalador detectará automaticamente o JDK instalado
   - Escolha o caminho de instalação (ou deixe o padrão)
   - Marque as opções de features que deseja instalar (recomendado: marcar todas)
   - Clique em "Install" (Instalar)
   - Aguarde a conclusão da instalação
   - Clique em "Finish" (Concluir)

3. **Instalar no macOS**
   - Abra o arquivo .dmg baixado
   - Arraste o ícone do NetBeans para a pasta Applications
   - Abra o NetBeans pela primeira vez (pode ser necessário permitir na Segurança)

4. **Instalar no Linux**
   ```bash
   # Dê permissão de execução ao instalador
   chmod +x netbeans-*-linux.sh
   
   # Execute o instalador
   ./netbeans-*-linux.sh
   
   # Siga as instruções na tela
   ```

### Método 2: Via Package Manager (Linux)

#### Ubuntu/Debian
```bash
sudo snap install netbeans --classic
```

---

## Como Abrir o Projeto no NetBeans

### Opção 1: Abrir Projeto Existente

1. **Iniciar o NetBeans**
   - Abra o NetBeans IDE (pode demorar alguns segundos na primeira vez)

2. **Abrir o Projeto**
   - No menu superior, clique em **"File" (Arquivo)** → **"Open Project" (Abrir Projeto)**
   - Ou use o atalho: `Ctrl+Shift+O` (Windows/Linux) ou `Cmd+Shift+O` (macOS)

3. **Navegar até o Projeto**
   - Navegue até a pasta onde está o projeto A3-PROJETO-JAVA
   - Selecione a pasta do projeto
   - Clique em **"Open Project" (Abrir Projeto)**

4. **Aguardar o Carregamento**
   - O NetBeans irá carregar o projeto
   - Aguarde enquanto o NetBeans indexa os arquivos (barra de progresso no canto inferior direito)

### Opção 2: Criar Novo Projeto

1. **Criar Novo Projeto**
   - No menu superior, clique em **"File" (Arquivo)** → **"New Project" (Novo Projeto)**
   - Ou use o atalho: `Ctrl+Shift+N` (Windows/Linux) ou `Cmd+Shift+N` (macOS)

2. **Escolher Tipo de Projeto**
   - Selecione **"Java with Maven"** ou **"Java with Ant"**
   - Escolha **"Java Application"** (Aplicação Java)
   - Clique em **"Next" (Próximo)**

3. **Configurar o Projeto**
   - **Project Name** (Nome do Projeto): Digite o nome do projeto
   - **Project Location** (Localização): Escolha onde salvar
   - **Create Main Class** (Criar Classe Principal): Marque esta opção
   - Clique em **"Finish" (Concluir)**

---

## Como Executar o Projeto

### Executar a Aplicação Principal

1. **Localizar a Classe Principal**
   - No painel "Projects" (Projetos) à esquerda
   - Expanda a pasta "Source Packages" (Pacotes de Origem)
   - Encontre a classe que contém o método `main`

2. **Executar o Projeto**
   - **Método 1**: Clique com o botão direito no nome do projeto e selecione **"Run" (Executar)**
   - **Método 2**: Pressione a tecla **F6**
   - **Método 3**: Clique no botão verde "Play" (▶) na barra de ferramentas
   - **Método 4**: Menu **"Run" (Executar)** → **"Run Project" (Executar Projeto)**

3. **Ver a Saída**
   - A saída do programa aparecerá na janela "Output" (Saída) na parte inferior do NetBeans
   - Se houver erros, eles aparecerão em vermelho

### Compilar o Projeto (Sem Executar)

1. **Compilar**
   - Clique com o botão direito no projeto
   - Selecione **"Build" (Construir)** ou **"Clean and Build" (Limpar e Construir)**
   - Ou pressione **Shift+F11**

2. **Verificar Erros**
   - Se houver erros de compilação, eles aparecerão na janela "Output" (Saída)
   - Também aparecerão sublinhados em vermelho no código

### Executar uma Classe Específica

1. **Selecionar a Classe**
   - Navegue até a classe .java que deseja executar
   - Clique com o botão direito no arquivo

2. **Executar**
   - Selecione **"Run File" (Executar Arquivo)**
   - Ou pressione **Shift+F6**

### Depurar (Debug) o Projeto

1. **Iniciar Depuração**
   - Pressione **Ctrl+F5** (Windows/Linux) ou **Cmd+F5** (macOS)
   - Ou clique no botão de "Debug" na barra de ferramentas

2. **Adicionar Breakpoints**
   - Clique na margem esquerda do editor (ao lado dos números de linha)
   - Um ponto vermelho aparecerá indicando o breakpoint

3. **Controles de Depuração**
   - **F7**: Step Into (Entrar na função)
   - **F8**: Step Over (Passar por cima)
   - **Ctrl+F7**: Continue (Continuar)

---

## Solução de Problemas

### NetBeans não encontra o JDK

**Problema**: NetBeans exibe mensagem "Cannot find Java"

**Solução**:
1. Verifique se o JDK está instalado corretamente: `java -version` no terminal
2. No NetBeans, vá em **"Tools" (Ferramentas)** → **"Java Platforms" (Plataformas Java)**
3. Clique em **"Add Platform" (Adicionar Plataforma)**
4. Navegue até a pasta de instalação do JDK
5. Clique em **"OK"**

### Projeto não compila

**Problema**: Erros de compilação aparecem

**Solução**:
1. Verifique se todos os arquivos .java estão salvos
2. Tente **"Clean and Build" (Limpar e Construir)** o projeto
3. Verifique se a versão do Java no projeto é compatível com o JDK instalado
4. Clique com o botão direito no projeto → **"Properties" (Propriedades)** → **"Sources"** → Verifique **"Source/Binary Format"**

### NetBeans está lento

**Solução**:
1. Feche projetos que não está usando: clique com o botão direito → **"Close"**
2. Aumente a memória do NetBeans:
   - Localize o arquivo `netbeans.conf` na pasta de instalação
   - Encontre a linha `netbeans_default_options`
   - Aumente os valores `-Xms` e `-Xmx` (exemplo: `-Xms512m -Xmx2048m`)

### Janela de Output não aparece

**Solução**:
- Vá em **"Window" (Janela)** → **"Output" (Saída)**
- Ou pressione **Ctrl+4** (Windows/Linux) ou **Cmd+4** (macOS)

### Caracteres especiais não aparecem corretamente

**Problema**: Acentuação e caracteres especiais aparecem como "?"

**Solução**:
1. Clique com o botão direito no projeto → **"Properties" (Propriedades)**
2. Vá em **"Sources"**
3. Em **"Encoding"**, selecione **"UTF-8"**
4. Clique em **"OK"**
5. Recompile o projeto

---

## Recursos Úteis

### Atalhos de Teclado Importantes

| Atalho | Ação |
|--------|------|
| `Ctrl+Space` | Auto-completar código |
| `Ctrl+S` | Salvar arquivo |
| `Ctrl+Shift+S` | Salvar todos os arquivos |
| `F6` | Executar projeto |
| `Shift+F6` | Executar arquivo atual |
| `Ctrl+F5` | Depurar projeto |
| `Shift+F11` | Compilar projeto |
| `Ctrl+Z` | Desfazer |
| `Ctrl+Y` | Refazer |
| `Ctrl+F` | Buscar no arquivo |
| `Ctrl+H` | Substituir no arquivo |
| `Alt+Shift+F` | Formatar código |

### Links Úteis

- **Site Oficial do NetBeans**: https://netbeans.apache.org/
- **Documentação do NetBeans**: https://netbeans.apache.org/help/
- **Oracle Java Documentation**: https://docs.oracle.com/en/java/
- **Tutoriais Java**: https://docs.oracle.com/javase/tutorial/

---

## Suporte

Se você encontrar problemas não listados aqui:
1. Consulte a documentação oficial do NetBeans
2. Verifique os fóruns da comunidade NetBeans
3. Entre em contato com o professor ou equipe do projeto

**Boa sorte com seu projeto A3!** 🚀
