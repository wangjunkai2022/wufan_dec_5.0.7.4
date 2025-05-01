.class Lcom/join/mgps/fragment/ChoiceFragment_$e;
.super Ljava/lang/Object;
.source "ChoiceFragment_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/ChoiceFragment_;->j0(Lcom/join/mgps/dto/HomeGameCarefullyBean;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/dto/HomeGameCarefullyBean;

.field final synthetic c:I

.field final synthetic d:Lcom/join/mgps/fragment/ChoiceFragment_;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/ChoiceFragment_;Lcom/join/mgps/dto/HomeGameCarefullyBean;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/ChoiceFragment_$e;->d:Lcom/join/mgps/fragment/ChoiceFragment_;

    iput-object p2, p0, Lcom/join/mgps/fragment/ChoiceFragment_$e;->b:Lcom/join/mgps/dto/HomeGameCarefullyBean;

    iput p3, p0, Lcom/join/mgps/fragment/ChoiceFragment_$e;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/ChoiceFragment_$e;->d:Lcom/join/mgps/fragment/ChoiceFragment_;

    iget-object v1, p0, Lcom/join/mgps/fragment/ChoiceFragment_$e;->b:Lcom/join/mgps/dto/HomeGameCarefullyBean;

    iget v2, p0, Lcom/join/mgps/fragment/ChoiceFragment_$e;->c:I

    invoke-static {v0, v1, v2}, Lcom/join/mgps/fragment/ChoiceFragment_;->q0(Lcom/join/mgps/fragment/ChoiceFragment_;Lcom/join/mgps/dto/HomeGameCarefullyBean;I)V

    return-void
.end method
