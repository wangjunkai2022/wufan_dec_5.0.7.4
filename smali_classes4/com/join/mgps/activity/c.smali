.class public final synthetic Lcom/join/mgps/activity/c;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:Landroid/widget/CheckBox;

.field public final synthetic c:Landroid/widget/CheckBox;

.field public final synthetic d:Landroid/widget/ImageView;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/CheckBox;Landroid/widget/CheckBox;Landroid/widget/ImageView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/join/mgps/activity/c;->b:Landroid/widget/CheckBox;

    iput-object p2, p0, Lcom/join/mgps/activity/c;->c:Landroid/widget/CheckBox;

    iput-object p3, p0, Lcom/join/mgps/activity/c;->d:Landroid/widget/ImageView;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    iget-object v0, p0, Lcom/join/mgps/activity/c;->b:Landroid/widget/CheckBox;

    iget-object v1, p0, Lcom/join/mgps/activity/c;->c:Landroid/widget/CheckBox;

    iget-object v2, p0, Lcom/join/mgps/activity/c;->d:Landroid/widget/ImageView;

    invoke-static {v0, v1, v2, p1}, Lcom/join/mgps/activity/CleanSpaceActivity$d;->a(Landroid/widget/CheckBox;Landroid/widget/CheckBox;Landroid/widget/ImageView;Landroid/view/View;)V

    return-void
.end method
