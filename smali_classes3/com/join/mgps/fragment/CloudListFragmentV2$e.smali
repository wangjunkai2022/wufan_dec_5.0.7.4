.class Lcom/join/mgps/fragment/CloudListFragmentV2$e;
.super Ljava/lang/Object;
.source "CloudListFragmentV2.java"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/CloudListFragmentV2;->v(Lcom/join/mgps/dto/CloudListDataBean;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/fragment/CloudListFragmentV2;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/CloudListFragmentV2;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/CloudListFragmentV2$e;->a:Lcom/join/mgps/fragment/CloudListFragmentV2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 0

    if-eqz p2, :cond_0

    .line 1
    iget-object p1, p0, Lcom/join/mgps/fragment/CloudListFragmentV2$e;->a:Lcom/join/mgps/fragment/CloudListFragmentV2;

    const/4 p2, 0x0

    invoke-static {p1, p2}, Lcom/join/mgps/fragment/CloudListFragmentV2;->b0(Lcom/join/mgps/fragment/CloudListFragmentV2;Z)Z

    goto :goto_0

    .line 2
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/fragment/CloudListFragmentV2$e;->a:Lcom/join/mgps/fragment/CloudListFragmentV2;

    const/4 p2, 0x1

    invoke-static {p1, p2}, Lcom/join/mgps/fragment/CloudListFragmentV2;->b0(Lcom/join/mgps/fragment/CloudListFragmentV2;Z)Z

    :goto_0
    return-void
.end method
