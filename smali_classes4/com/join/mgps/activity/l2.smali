.class public final synthetic Lcom/join/mgps/activity/l2;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:Lcom/join/mgps/activity/PapaMainFragment;

.field public final synthetic c:I

.field public final synthetic d:Lcom/join/mgps/dto/BannerBean;


# direct methods
.method public synthetic constructor <init>(Lcom/join/mgps/activity/PapaMainFragment;ILcom/join/mgps/dto/BannerBean;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/join/mgps/activity/l2;->b:Lcom/join/mgps/activity/PapaMainFragment;

    iput p2, p0, Lcom/join/mgps/activity/l2;->c:I

    iput-object p3, p0, Lcom/join/mgps/activity/l2;->d:Lcom/join/mgps/dto/BannerBean;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    iget-object v0, p0, Lcom/join/mgps/activity/l2;->b:Lcom/join/mgps/activity/PapaMainFragment;

    iget v1, p0, Lcom/join/mgps/activity/l2;->c:I

    iget-object v2, p0, Lcom/join/mgps/activity/l2;->d:Lcom/join/mgps/dto/BannerBean;

    invoke-static {v0, v1, v2, p1}, Lcom/join/mgps/activity/PapaMainFragment;->V(Lcom/join/mgps/activity/PapaMainFragment;ILcom/join/mgps/dto/BannerBean;Landroid/view/View;)V

    return-void
.end method
