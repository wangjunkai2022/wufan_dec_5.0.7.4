.class public final synthetic Lq1/b;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:Lcom/join/android/app/component/video/c;

.field public final synthetic c:Lcom/join/kotlin/ui/modleregin/modle/VideoModle;


# direct methods
.method public synthetic constructor <init>(Lcom/join/android/app/component/video/c;Lcom/join/kotlin/ui/modleregin/modle/VideoModle;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq1/b;->b:Lcom/join/android/app/component/video/c;

    iput-object p2, p0, Lq1/b;->c:Lcom/join/kotlin/ui/modleregin/modle/VideoModle;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lq1/b;->b:Lcom/join/android/app/component/video/c;

    iget-object v1, p0, Lq1/b;->c:Lcom/join/kotlin/ui/modleregin/modle/VideoModle;

    invoke-static {v0, v1, p1}, Lcom/join/kotlin/bindingadapter/ViewBindingVideoFramlayoutKt;->a(Lcom/join/android/app/component/video/c;Lcom/join/kotlin/ui/modleregin/modle/VideoModle;Landroid/view/View;)V

    return-void
.end method
