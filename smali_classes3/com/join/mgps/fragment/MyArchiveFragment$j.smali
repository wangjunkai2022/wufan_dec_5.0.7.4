.class Lcom/join/mgps/fragment/MyArchiveFragment$j;
.super Ljava/lang/Object;
.source "MyArchiveFragment.java"

# interfaces
.implements Lcom/join/mgps/listener/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/MyArchiveFragment;->O0(Lcom/join/mgps/dto/CloudListDataBean;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/fragment/MyArchiveFragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/MyArchiveFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/MyArchiveFragment$j;->b:Lcom/join/mgps/fragment/MyArchiveFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public J(Lcom/join/mgps/dto/CloudListDataBean;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/join/mgps/fragment/MyArchiveFragment$j;->b:Lcom/join/mgps/fragment/MyArchiveFragment;

    const/4 v0, 0x0

    iput-boolean v0, p1, Lcom/join/mgps/fragment/MyArchiveFragment;->N:Z

    .line 2
    invoke-virtual {p1, v0}, Lcom/join/mgps/fragment/MyArchiveFragment;->C0(Z)V

    return-void
.end method

.method public Q(Lcom/join/mgps/dto/CloudListDataBean;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/join/mgps/fragment/MyArchiveFragment$j;->b:Lcom/join/mgps/fragment/MyArchiveFragment;

    const/4 v0, 0x0

    iput-boolean v0, p1, Lcom/join/mgps/fragment/MyArchiveFragment;->N:Z

    .line 2
    invoke-virtual {p1, v0}, Lcom/join/mgps/fragment/MyArchiveFragment;->C0(Z)V

    .line 3
    iget-object p1, p0, Lcom/join/mgps/fragment/MyArchiveFragment$j;->b:Lcom/join/mgps/fragment/MyArchiveFragment;

    iget-boolean v0, p1, Lcom/join/mgps/fragment/MyArchiveFragment;->H:Z

    if-nez v0, :cond_0

    const-string/jumbo v0, "\u5907\u4efd\u5931\u8d25"

    .line 4
    invoke-virtual {p1, v0}, Lcom/join/mgps/fragment/MyArchiveFragment;->showMessage(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
