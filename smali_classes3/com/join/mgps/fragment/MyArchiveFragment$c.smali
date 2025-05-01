.class Lcom/join/mgps/fragment/MyArchiveFragment$c;
.super Ljava/lang/Object;
.source "MyArchiveFragment.java"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/MyArchiveFragment;->H0(Lcom/join/mgps/dto/CloudListDataBean;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/fragment/MyArchiveFragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/MyArchiveFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/MyArchiveFragment$c;->a:Lcom/join/mgps/fragment/MyArchiveFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 0

    if-eqz p2, :cond_0

    .line 1
    iget-object p1, p0, Lcom/join/mgps/fragment/MyArchiveFragment$c;->a:Lcom/join/mgps/fragment/MyArchiveFragment;

    const/4 p2, 0x0

    iput-boolean p2, p1, Lcom/join/mgps/fragment/MyArchiveFragment;->L:Z

    goto :goto_0

    .line 2
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/fragment/MyArchiveFragment$c;->a:Lcom/join/mgps/fragment/MyArchiveFragment;

    const/4 p2, 0x1

    iput-boolean p2, p1, Lcom/join/mgps/fragment/MyArchiveFragment;->L:Z

    :goto_0
    return-void
.end method
